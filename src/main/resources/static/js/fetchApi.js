//Fetch general
fetch('http:/localhost:8080/buscarTodosAdministracion')
  .then(function(respuesta){
    return respuesta.json();
  })
  .then(function(dataCruda) {
    console.log(dataCruda);
    var i=0;
    //Pagina principal Administración
    let nombreProducto = document.querySelectorAll('td.nombreProducto');
    let descProducto = document.querySelectorAll('td.descProducto');
    let precioProducto = document.querySelectorAll('td.precioProducto');
    let stockProducto = document.querySelectorAll('td.stockProducto');
    tituloProducto.forEach(function(elemento){
      console.log("Iterando elementos en view");
      nombreProducto[i].innerHTML=dataCruda[i].nombre;
      descProducto[i].innerHTML=dataCruda[i].descripcion;
      precioProducto[i].innerHTML=dataCruda[i].precio;
      stockProducto[i].innerHTML=dataCruda[i].categoria;
      i++;
    });

//Buscador Administracion
function onFormSubmitAdministracion() {
    fetch("http:/localhost:8080/buscarVariosProductosAdministracion", {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
          body: JSON.stringify(readFormData()) // body data type must match "Content-Type" header

    }).then(function (response){
        return response.text();
    }).then(function (data){
        console.log(data);
    })
}
function readFormData() {
    //Pagina Administración
    let i = 0;
    let nombreProducto = document.getElementById("nombreProducto").value;
    let descProducto = document.getElementById("descProducto").value;
    let precioProducto = document.getElementById("precioProducto").value;
    let stockProducto = document.getElementById("stockProducto").value;
    nombreProducto.forEach(function(elemento)){
      nombreProducto[i].innerHTML=dataCruda[i].nombre;
      descProducto[i].innerHTML=dataCruda[i].nombre;
      precioProducto[i].innerHTML=dataCruda[i].nombre;
      stockProducto[i].innerHTML=contarStock(dataCruda[i].id);
      i++;
    }
}
function contarStock(id){

}
