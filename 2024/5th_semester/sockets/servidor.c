// Made by Mónica Gómez (Autumn64)
// This code is a bit awful; sorry for that. This is my first time using sockets.
#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/un.h>
#include <sys/types.h>
#include <sys/socket.h>

#define NSOCKET "/tmp/uvmhispano.sock"
#define BUFFER_SIZE 500

void solicitud(int data_socket){
		int ret;
		char buffer[BUFFER_SIZE];

		while (ret = read(data_socket, buffer, BUFFER_SIZE) > 0){
			if (ret == -1){
					perror("Error leyendo la información: ");
					exit(EXIT_FAILURE);
			}

			buffer[BUFFER_SIZE - 1] = 0;
			printf("%s", buffer);
			memset(buffer, 0, BUFFER_SIZE);
		}
}

int crearSocket(){
		struct sockaddr_un server_addr;

		int servidor = socket(AF_UNIX, SOCK_STREAM, 0);
		if (servidor == -1) {
				perror("Error creando el socket: ");
				exit(EXIT_FAILURE);
		}

		// Supuestamente hay que limpiar el struct para asegurar la portabilidad.
		memset(&server_addr, 0, sizeof(struct sockaddr_un));

		server_addr.sun_family = AF_UNIX;
		strncpy(server_addr.sun_path, NSOCKET, sizeof(server_addr.sun_path) - 1);
		int ret = bind(servidor, (const struct sockaddr *) &server_addr, sizeof(struct sockaddr_un));
		if (ret == -1){
				perror("Error conectando el socket: ");
				exit(EXIT_FAILURE);
		}
		ret = listen(servidor, 20);
		if (ret == -1){
				perror("Error intentando escuchar al socket: ");
				exit(EXIT_FAILURE);
		}
		return servidor;
}

void conexiones(int servidor){
		int data_socket;
		pid_t pid;
		
		for(;;){
				data_socket = accept(servidor, NULL, NULL);
				if (data_socket == -1){
						perror("Error en la conexión: ");
						exit(EXIT_FAILURE);
				}
				// Se crea el fork para poder atender a cada conexión de manera concurrente.
				pid = fork();
				if (pid == -1){
						perror("Error al generar conexión: ");
						exit(EXIT_FAILURE);
				}
				if (pid == 0){
						close(servidor);
						solicitud(data_socket);
						exit(EXIT_SUCCESS);
				}else {
						close(data_socket);
				}
		}
}


int main(void){
		// https://systemprogrammingatntu.github.io/mp2/unix_socket.html
		unlink(NSOCKET);

		int servidor = crearSocket();
		signal(SIGCHLD, SIG_IGN);
		conexiones(servidor);

		close(servidor);
		unlink(NSOCKET);

		return 0;
}
