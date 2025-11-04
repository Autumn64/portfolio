function setHeadings(json){
    for (let i = 0; i < 3; i++){
        $("a.heading").eq(i).attr("href", json[i]["url"]);
        $("img.heading").eq(i).attr("src", json[i]["image"]);
        $("h3.heading").eq(i).text(json[i]["title"]);
        $("p.heading").eq(i).text(json[i]["description"]);
    }
}

function setNews(createRow, news){
    if (createRow === true) 
        $("#newsContainer").append($("<section>").addClass("newsRow row align-items-start gy-4"));

    $(".newsRow").last().append($("<div>").addClass("col-12 col-sm-6 col-md-4"));
    $(".col-12").last().append($("<div>").addClass("card mt-3"));

    $(".card").last().html(`
        <img src="${news["image"]}" class="card-img-top" alt="${news["title"]}">
        <div class="card-body">
            <h5 class="card-title">${news["title"]}</h5>
            <p class="card-text">${news["description"]}</p>
            <p class="card-text">Publicado el ${new Date(news["publishedAt"]).toDateString()}</p>
            <a href="${news["url"]}" target="_blank" class="btn btn-primary">Leer noticia</a>
        </div>
    `);
}

$(setTimeout(async () =>{
    const json = await fetchNews();
    setHeadings(json);

    let i = 0;

    for (const element of json){
        setNews((i++ % 3 === 0), element);
    }

    $("#loadingContainer").hide(500, () =>{
        $("#newsCarousel").show(500);
        $("#newsContainer").show(700);
    });
}, 3000));