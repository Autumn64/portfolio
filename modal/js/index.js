const modalBtn1 = document.getElementById("modal-btn1");
const modalBtn2 = document.getElementById("modal-btn2");
const modalContainer = document.getElementById("modal-container");
const modalBg = document.getElementById("modal");

const createModal = content =>{
    document.getElementById("modal-main").innerHTML = content;
}

const showHideModal = () =>{
    modalContainer.classList.toggle("hidden");
}

modalBtn1.addEventListener("click", () =>{
    createModal(`
        <h3>Este es el contenido del modal 1</h3>
        <img src="res/IMG_20250816_005020_608.webp" style="width: 100px; height: auto;">
        <h5>Flores Gómez G. 660103897</h5>
        `);
    showHideModal();
});

modalBtn2.addEventListener("click", () =>{
    createModal(`
        <h3>Este es el contenido del modal 2</h3>
        <a href="https://www.autumn64.xyz" target="_blank">Página web personal</a>
        <h5>Flores Gómez G. 660103897</h5>
        `);
    showHideModal();
});

modalBg.addEventListener("click", e =>{
    if (e.target.id !== "modal" && e.target.id !== "modal-btn-close") return;
    showHideModal();
});