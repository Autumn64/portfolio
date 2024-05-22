# Made by Mónica Gómez (Autumn64)

CFLAGS := -g -Wall -Wextra

.PHONY: all
all: promedio_malloc promedio_array promedio_suma

promedio_malloc: src/main3.c
	gcc $(CFLAGS) $^ -o $@ 

promedio_array: src/main2.c
	gcc $(CFLAGS) $^ -o $@

promedio_suma: src/main.c
	gcc $(CFLAGS) $^ -o $@

.PHONY: clean
clean:
	rm -rf promedio_malloc promedio_array promedio_suma
