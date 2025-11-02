/*
    A la última fila existente le agrega una columna, y a esa columna le agrega una tarjeta,
    luego a la tarjeta le asigna el HTML con la información del post. Trunca la descripción de la noticia
    a 200 caracteres para que no quede demasiado enorme.

    Al inicio había implementado que se mostrara también la imagen de cada noticia, pero no todas
    vienen con imagen, además de que las que sí traen imagen están muy disparejas y utilizan tamaños y
    resoluciones diferentes, y simplemente le agrega demasiada complejidad innecesaria al código. 
    Por eso al final decidí utilizar la misma imagen para todas las noticias a costa de que todo se 
    vea demasiado uniforme.
*/
function setNews(createRow, title, description, link){
    const shortDesc = description.substring(0, 200) + "[...]";

    if (createRow === true) 
        $("#newsContainer").append($("<section>").addClass("newsRow row row-gap-4 mb-4 justify-content-center"));

    $(".newsRow").last().append($("<div>").addClass("col-sm-4"));
    $(".col-sm-4").last().append($("<div>").addClass("card"));
    $(".card").last().html(`
        <img src="res/yazhouradio.jpg" class="card-img-top">
        <div class="card-body">
            <h5 class="card-title">${title}</h5>
            <p class="card-text">${shortDesc}</p>
            <a href="${link}" target="_blank" class="btn btn-primary">Leer</a>
        </div>
    `);
}

/* 
    Obtiene el `news.xml`, que debe descargarse manualmente de https://conkdekpop.com/category/k-news/feed/
    (haciéndolo desde la URL es bloqueado por la CORS) y con jQuery lo parsea a XML, retornando los <item>.
*/
async function getNewsJSON(){
    const response = await fetch("res/news.xml");
    const xmlDoc = $.parseXML(await response.text());
    return $(xmlDoc).find("item");
}

/*
    Lee el texto de los elementos <title>, <description> y <link> cada <item> y lo pasa a la función.
    Cada tres noticias crea una línea nueva de Bootstrap para respetar el grid.
*/
async function loadNews(){
    const newsItems = await getNewsJSON();

    let i = 0;
    
    for (const element of newsItems){
        const title = $(element).find("title").text();
        const description = $(element).find("description").text();
        const link = $(element).find("link").text();

        setNews((i++ % 3 === 0), title, description, link);        
    }
}

$(() =>{
    setTimeout(() =>{
        $("#loadingScreen").hide("slow", loadNews);
    }, 3000);
});