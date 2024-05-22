// Made by Mónica Gómez, 660103897
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[]){
	printf("Este es mi PID: %d\n", (int) getpid());
	getchar();
	return 0;
}
