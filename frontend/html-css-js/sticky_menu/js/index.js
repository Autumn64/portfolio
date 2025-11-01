const burger = document.getElementById("burger");
const close = document.getElementById("close");
const stickyMenu = document.getElementById("sticky-menu");

document.getElementById("burger-menu").addEventListener("click", () =>{
    stickyMenu.classList.toggle("menu-active");

    burger.classList.toggle("hidden");
    close.classList.toggle("hidden");
});

/* 
    Un bucle que agrega el comportamiento de ocultar el menú
    al dar click en cualquera de los links.
*/
for (let element of stickyMenu.children){
    if (element.tagName !== "A") continue;

    element.addEventListener("click", () =>{
        if (!stickyMenu.classList.contains("menu-active")) return;

        stickyMenu.classList.remove("menu-active");
        burger.classList.toggle("hidden");
        close.classList.toggle("hidden");
    });
}