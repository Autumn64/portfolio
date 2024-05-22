// Made by Mónica Gómez (Autumn64).
#include <stdio.h>

char resp;

int main(){
	do{
		char voc[6];
		int aux[6], temp, i, j;

		for (i = 0; i < 6; i++){
			printf("\n\033[1;32mDame la vocal: ");
			scanf("%s", &voc[i]);
		}

		// Vocales antes
		printf("\033[1;36m*** VOCALES ANTES DE ORDENARLOS ***\n");
		for (i = 0; i < 6; i++){
			printf("%c\t", voc[i]);
		}

		// Asignación de valores
		for (i = 0; i < 6; i++){
			switch(voc[i]){
				case 'a':
					aux[i] = 1;
					break;
				case 'e':
					aux[i] = 2;
					break;
				case 'i':
					aux[i] = 3;
					break;
				case 'o':
					aux[i] = 4;
					break;
				case 'u':
					aux[i] = 5;
					break;
			}
		}

		// Ordenar mayor a menor
		for (i = 0; i < 6; i++){
			for (j = 0; j < 5; j++){
				if (aux[j] > aux[j+1]){
					temp = aux[j];
					aux[j] = aux[j+1];
					aux[j+1] = temp;
				}

			}
		}

		// Tabla de vocales ordenadas
		for (i = 0; i < 6; i++){
			switch(aux[i]){
				case 1:
					voc[i] = 'a';
					break;
				case 2:
					voc[i] = 'e';
					break;
				case 3:
					voc[i] = 'i';
					break;
				case 4:
					voc[i] = 'o';
					break;
				case 5:
					voc[i] = 'u';
					break;
			}
		}

		// Vocales después
		
		printf("\033[1;37m\n *** VOCALES ORDENADOS ***\n");
		for (i = 0; i < 6; i++){
			printf("%c\t", voc[i]);
		}

		printf("\n\033[1;37m Quieres continuar? (s-Si / n-No): ");
		scanf("%s", &resp);
	}while (resp == 's' || resp == 'S');
	return 0;
}
