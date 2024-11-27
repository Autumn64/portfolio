// Made by Mónica Gómez (Autumn64)
let usuarios = 0;
const maxUsuarios = 3;

async function hiloImpresora(numero) {
    const container = document.getElementById("container");
    container.innerHTML += `El usuario ${numero} está esperando la impresora.<br>`;
    
    await esperarTurno();

    try {
        usuarios++;
        container.innerHTML += `El usuario ${numero} está usando la impresora.<br>`;
        
        await new Promise(r => setTimeout(r, Math.ceil(Math.random() * 10) * 1000));
        
        container.innerHTML += `El usuario ${numero} terminó de usar la impresora.<br>`;
    } finally {
        usuarios--;
    }
}

function esperarTurno() {
    return new Promise(resolve => {
        const interval = setInterval(() => {
            if (usuarios < maxUsuarios) {
                clearInterval(interval);
                resolve();
            }
        }, 100);
    });
}

document.addEventListener('DOMContentLoaded', () => {
    const hilos = Array.from({ length: 10 }, (_, i) => hiloImpresora(i + 1));
    Promise.all(hilos).then(() => {});
});
