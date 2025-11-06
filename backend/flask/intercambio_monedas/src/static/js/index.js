/*
    Ocultamos los resultados y mostramos el mensaje de error. Tanto con
    `hide()` como con `show()` el número indica el tiempo que va a durar
    la transición.
*/
function showErrors(message){
    $("#resultSection").hide(300);
    $("#loadingScreen").hide(200);
    $("#errorMsg").show(300);
    $("#errorMsg").text(`ERROR: ${message}`);
}

$("#submitBtn").click((e) => {
    e.preventDefault();
    $("#errorMsg").hide(300);
    $("#resultSection").hide(300);

    let amount = $("#amount").val();

    /*  
        Esta burrada es una forma corta de revisar si en el campo de
        cantidad no pusimos nada.
    */
    if (["", null, undefined].includes(amount)){
        showErrors(`El campo "cantidad" es obligatorio.`);
        return;
    }

    /*
        Usamos un regex para determinar si pusimos algo que no son
        números en el campo de cantidad.
    */
    if(!amount.match(/^\d+$/)) {
        showErrors(`Sólo puedes incluir números`);
        return;
    }

    let firstCurr = $("#firstCurr").val();
    let secondCurr = $("#secondCurr").val();
    
    // No hace la conversión si seleccionamos la misma moneda en ambos casos
    if (firstCurr === secondCurr){
        showErrors(`No puedes convertir ${firstCurr} a ${secondCurr} porque son iguales.`);
        return;
    }

    $("#loadingScreen").show(200);

    /*
        Hace la petición a nuestra API y obtiene el resultado en JSON,
        hace las transiciones necesarias y coloca el resultado en donde va.

        Si se deja la URL como `localhost` entonces la página no funcionará
        si se prueba desde el celular o desde un dispositivo diferente; es
        mejor idea quitar el `localhost` y poner la dirección IP que sale con
        `ipconfig` o con `ifconfig` (y la misma dirección IP se usaría desde
        el otro dispositivo para acceder a la página).
    */
    fetch(`http://localhost:5000/getExchange?amount=${amount}&from=${firstCurr}&to=${secondCurr}`)
    .then(response => response.json())
    .then(response => {
        $("#loadingScreen").hide(200);
        $("#resultSection").show(300);
        $("#currOne").text(firstCurr);
        $("#currTwo").text(secondCurr);
        $("#resultOne").val(response.message.amount);
        $("#resultTwo").val(response.message.result);

        // Hace scroll automático a la sección del resultado
        $(window).scrollTop($('#resultSection').position().top);
    })
    .catch(error => showErrors(error));
});

/* 
    Si `x` es la primera moneda y `y` es la segunda:
    z = x
    x = y
    y = z
*/
$("#changeBtn").click(e =>{
    e.preventDefault()
    let tmpValue = $("#firstCurr").val();

    $("#firstCurr").val($("#secondCurr").val());
    $("#secondCurr").val(tmpValue);
});