const burger_button = document.getElementById("burger-button");
const nav_container = document.getElementById("nav-container");
const nav_menu = document.getElementById("nav-menu");

const showHideNav = () => {
    nav_menu.classList.toggle("hidden");
    nav_container.classList.toggle("hidden");
}

burger_button.addEventListener("click", showHideNav);

nav_container.addEventListener("click", e =>{
    if (!["nav-container", "close-btn"].includes(e.target.id)) return;

    showHideNav();
});