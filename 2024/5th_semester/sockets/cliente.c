// Made by Mónica Gómez (Autumn64)
// This code is a bit awful; sorry for that. This is my first time using sockets.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/un.h>
#include <sys/socket.h>

#define NSOCKET "/tmp/uvmhispano.sock"
#define BUFFER_SIZE 500

int crearSocket(){
		struct sockaddr_un server_addr;
		int ret, data_socket;

		data_socket = socket(AF_UNIX, SOCK_STREAM, 0);
		if (data_socket == -1){
				perror("Error conectando al socket: ");
				exit(EXIT_FAILURE);
		}
		memset(&server_addr, 0, sizeof(struct sockaddr_un));
		server_addr.sun_family = AF_UNIX;
		strncpy(server_addr.sun_path, NSOCKET, sizeof(server_addr.sun_path) - 1);
		ret = connect(data_socket, (const struct sockaddr *) &server_addr, sizeof(struct sockaddr_un));
		if (ret == - 1){
				fprintf(stderr, "El servidor está apagado.\n");
				exit(EXIT_FAILURE);
		}
		return data_socket;
}

void enviarMensaje(int data_socket, char *username){
		char buffer[BUFFER_SIZE];
		int ret;

		for(;;){
				/* 
				 Limpiamos el char array antes de usarlo para evitar
				 mensajes mochos o empalmados.
				*/
				memset(buffer, 0, BUFFER_SIZE);
				printf("\x1B[1BMensaje: ");
				fgets(buffer, BUFFER_SIZE, stdin);
				buffer[strlen(buffer)] = 0;
				if (strcmp(buffer, "SALIR\n") == 0) break;
				char mensaje[strlen(buffer) + strlen(username) + 5];
				sprintf(mensaje, "%s: %s", username, buffer);
				ret = write(data_socket, mensaje, strlen(mensaje));
				if (ret == - 1){
					perror("Error enviando mensaje: ");
					exit(EXIT_FAILURE);
				}
		}

		return;
}

int main(int argc, char *argv[]){
		if (argc < 2){
				fprintf(stderr, "Sintaxis: ./cliente nombre_de_usuario\n\n");
				return 1;
		}
		int data_socket = crearSocket();
		enviarMensaje(data_socket, argv[1]);
		close(data_socket);
		return 0;
}
