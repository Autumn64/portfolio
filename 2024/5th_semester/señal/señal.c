// Made by Mónica Gómez (Autumn64).
#include <math.h>
#include <stdio.h>
#include <unistd.h>
#include <pthread.h>

int correcto = 0;

void *numeroNatural(void *st){
		int numero = 0;
		char *str = (char *) st;

		for (int i = 7; i >= 0; i--){
				if (str[i] == '1') numero += (int) pow(2.0, (double) (7 - i));
				if (str[i] != '0' && str[i] != '1') return NULL;
		}
		printf("Número natural: %d\n", numero);
		correcto = 1;

		return NULL;
}

void *numeroSimetrico(void *st){
		int numero = 0;
		char *str = (char *) st;

		for(int i = 7; i >= 1; i--){
				if (str[i] == '1') numero += (int) pow(2.0, (double) (7 - i));
				if (str[i] != '0' && str[i] != '1') return NULL;
		}
		if (str[0] == '0') numero -= (2 * numero);
		printf("Número simétrico: %d\n", numero);

		correcto = 1;

		return NULL;	
}

int main(void){
		char str[9];
		pthread_t t1, t2;
		printf("***** PROCESAMIENTO DE SEÑALES *****\n\n");
		printf("Escribe un número en binario de máximo 8 bits. Cualquier bit adicional se descartará.\n");
		printf("Número: ");
		fgets(str, 9, stdin);
		pthread_create(&t1, NULL, numeroNatural, str);
		pthread_create(&t2, NULL, numeroSimetrico, str);
		pthread_join(t1, NULL);
		pthread_join(t2, NULL);
		if (correcto == 0){
				fprintf(stderr, "Solo debes poner unos y ceros.\n");
				return 1;
		}
		return 0;
}
