window.onload = function (){

var nombre, apellido, email, telefono, consulta, dni, contraseña, repetirContraseña, checkPass, checkNum, expresionEmail;

nombre = document.querySelector("input[name=Nombre]");
console.log(nombre);
apellido = document.querySelector("input[name=Apellido]");
email = document.querySelector("input[name=Email]");
console.log(email);
telefono = document.querySelector("input[name=Telefono]");
consulta = document.querySelector("input[name=Consulta]");
dni = document.querySelector("input[name=DNI]");
contraseña = document.querySelector("input[name=Contraseña]");
repetirContraseña = document.querySelector("input[name=RepetirContraseña]");
checkName = /^[^<>()[\].,;:\s@"]+(?:\.[^<>()[\].,;:\s@"]+)*@(?:[^<>()[\].,;:\s@"]+\.)+[^<>()[\]\.,;:\s@"]{2,63}$/i;
checkNum = /([0-9])$/;
checkLet = /([a-z])$/i;
checkPass = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])([A-Za-z\d$@$!%*?&]|[^ ]){6,30}$/;
expresionEmail = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;


nombre.onchange = function (){
  if (this.value.length >= 30 && this.lenght != ""){
    alert("Tu nombre debe de ser más corto");
    this.value = "";
    event.preventDefault();
  }//else if (this.value != checkNum) {
    else if (checkNum.test(this.value)) {
    alert("No puedes incluir numeros en tu nombre");
    this.value = "";
    event.preventDefault();
  }

}
apellido.onchange = function (){
  if (this.value.lenght >= 30 && this.lenght != ""){
    alert("Tu apellido debe de ser más corto")
    event.preventDefault();
  }
  else if (checkNum.test(this.value)) {
    alert(" No puedes incluir numeros en tu apellido");
    this.value = "";
    event.preventDefault();
  }
}
email.onchange = function (){

  if (this.lenght >= 30 && this.lenght != ""){
    alert("Tu email debe de ser más corto y no puede estar vacio");
    event.preventDefault();
  }
  else if (!expresionEmail.test(this.value)) {
    alert("Tu email tiene un formato invalido ");
    console.log("test expresion = "+ expresionEmail.test(this.value));
    this.value = "";
    event.preventDefault();
  }
}

telefono.onchange = function (){
  if (this.value.lenght >= 30 && this.lenght != ""){
    alert("Tu teléfono debe de ser más corto")
    event.preventDefault();
  }
  else if (!checkNum.test(this.value)) {
    alert(" Tu teléfono debe contener solamente numeros")
    event.preventDefault();
  }
}
try{
  consulta.onchange = function (){

    if (this.lenght >= 200 && this.lenght != ""){
      alert("Tu consulta es muy extensa")
      event.preventDefault();
    }




  }
}
catch(error){
  console.log("Consulta no existe en este documento: " + error.message);
}
dni.onchange = function (){
  if (this.lenght >= 11 && this.lenght != ""){
    alert("Tu DNI o CUIT debe de ser más corto")
    event.preventDefault();
  }
  else if (checkNum.Test(this)) {
    alert(" Tu DNI o CUIT debe contener solamente numeros ")
    this.value = "";
    event.preventDefault();
  }

}
contraseña.onchange = function (){
  if (!checkPass.test(this.value)){
    alert("La contraseña debe contener: \n Minimo 6 caracteres \n Maximo 30 \n Al menos una letra mayúscula \n Al menos una letra minucula \n Al menos un dígito \n No espacios en blanco \n Al menos 1 caracter especial");
    this.value = "";
    event.preventDefault();
  }

}
repetirContraseña.onchange = function (){
  if (this.value != contraseña.value){
    alert("Debes repetir correctamente la contraseña")
    this.value = "";
    event.preventDefault();
  }

}


}
