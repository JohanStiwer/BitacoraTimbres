//Formulario para tomar los datos
const formulario = document.querySelector("#formulario");
//boton para buscar
const boton = document.querySelector("#boton");
//campo para imprimir el resultado
const resultado = document.querySelector("#resultado");
//Campo para recibir el numero de solicitud
const NumSolicitud = document.querySelector("#NumSolicitud");

//Metodo para filtrar 
const filtrar = () => {
    resultado.innerHTML = "";
    //console.log(formulario.value);
    const texto = formulario.value.toLowerCase();
    for (let valor of NumSolicitud) {
        //Comparar
        let nombre = valor.nombre.toLowerCase();
        //Compara el texto con indexOf
        if (nombre.indexOf(texto) !== -1) {
            resultado.innerHTML += `<li>${valor.nombre}</li>`;
        }
    }
    if (resultado.innerHTML === "") {
        resultado.innerHTML += "<li>PRODUCTO NO ENCONTRADO</li>";
    }
};