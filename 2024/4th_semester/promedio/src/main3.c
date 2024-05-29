// Made by Mónica Gómez (Autumn64).
#include <stdio.h>
#include <stdlib.h>

int promedios(int n){
		float *p, sum = 0;
		int el;
		char op;
		if (n == 0) {
			printf("Ingrese el número de calificaciones: ");
			scanf("%d", &n); //'%d' es para un número entero, el de double es '%lf'.
		}
		printf("\n***** LEYENDO %d CALIFICACIONES *****\n\n", n);

		p = malloc(sizeof(float) * n);

		if (p == NULL){
			perror("Asignación de memoria fallida!");
			return 1;
		}
		for(int i = 0; i < n; i++){
				printf("Ingrese la calificación #%d: ", i + 1);
				scanf("%f", (p + i));
				sum += *(p + i);
		}

		printf("\nPROMEDIO: %.2f\n", sum/(float) n);

		for(;;){
			printf("Hay %d calificaciones disponibles, escoja la calificación que desea ver (%d para ver promedio) [1 - %d]: ", n, n + 1, n + 1);
			scanf("%d", &el);
			getchar();
			if (el > (n + 1) || el <= 0){
					printf("La calificación %d no existe.\n\n", el);
					continue;
			}
			else if (el == (n + 1)) printf("PROMEDIO: %.2f\n", sum/(float) n);
			else printf("CALIFICACIÓN %d: %.2f\n", el, *(p + (el - 1)));
			
			printf("Desea salir? (S/n): ");
			scanf("%c", &op);
			getchar();
			if (op == 'S' || op == 's') break;
			continue;
		}

		free(p);
		return 0;
}

int main(int argc, char *argv[]){
		if (argc < 2){
				return promedios(0);
		}
		return promedios(strtol(argv[1], NULL, 10));
}
