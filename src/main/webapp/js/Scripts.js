// HEADER 

let miheader = `
    
    
    <nav>
    
    <div class="titulo">
    <h1> Surf & Stuff Co. </h1>  
    </div>
    
    
    
    <div class="contenedornav">
            <a class="anav" href="index.html">HOME</a>
            <a class="anav" href="surf.html">SURF</a>
            <a class="anav" href="contacto.html">CONTACTO</a>
            <a class="anav" href="quienessomos.html">QUIENES SOMOS</a>
            <a class="anav" href="login.html">LOGIN</a>
        </div>
    </nav>


    

`
//<a class="anav" href="./img/login icon.png">Login</a>
document.querySelector("header").innerHTML = miheader;


// ESLIDER PRINCIPAL 

let slideIndex = 0;
showSlides();

function showSlides() {
    let i;
    let slides = document.getElementsByClassName("mySlides");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slideIndex++;
    if (slideIndex > slides.length) { slideIndex = 1 }
    slides[slideIndex - 1].style.display = "block";
    setTimeout(showSlides, 4000); // cambia la imagen cada 4 segundos 
}


// FORMULARIO VALIDACIONES

function enviarFormulario() {
    // Simulación de envío exitoso
    alert("¡Tu formulario ha sido enviado!");
    limpiarFormulario();
}

function limpiarFormulario() {
    alert("¡Tu formulario ha sido borrado!");
    document.getElementById("contactForm").reset();
}


// LOGIN VALIDACIONES

var nomUsu, passUsu;

var usuarios = new Object ()
usuarios.nombreUsu = nomUsu
usuarios.contraUsu = passUsu

localStorage.setItem("usuarioLog", nomUsu)
localStorage.setItem("contraUsuLog", passUsu)

function validar(){
    if(nomUsu || passUsu == NULL){
        console.log("Debe completar todos los campos requeridos")
    } else { 
    }
}

// REGISTRARSE 

// function registrarse(){
//     `<a href="registro.html"></a>`
// }


//API REST

function traerapi() {
    fetch('https://dolarapi.com/v1/dolares/blue')
        .then(data => data.json())
        .then(data => {
            console.log(data)
            console.log("Api activa")
            let datos = `
                <h1>Dolar API</h1>
                <img src="./img/dolar_api.jpg" alt="dolar.api"> 
                <h1>Cotizacion Divisas ${data.moneda} ${data.casa}: ${data.venta} $ </h1>
                <h1>Fecha actualizacion ${data.fechaActualizacion} </h1>
                <div class="apibtn">
                        <button class="apiboton" type="button" onclick="traerapi()">Consultar API</button>
                </div>
                
            `

            document.getElementById("apiID").innerHTML = datos

            
        })

}

// Script obtener datos de back Tablas

console.log("Entro a GetRequest");
document.addEventListener("DOMContentLoaded", function() {

  const tablasSection = document.getElementById("tablas");
  const tablas = [];

  function loadTablasList() {
    console.log("Entro a loadTablasList");
    fetch("/tiendasurf/tablas?action=getAll")
      .then(response => response.json())
      .then(data => {
        console.log("data : "+data);
        data.forEach(tabla =>{
          tablas.push(tabla);
          tablasSection.innerHTML += `
            <tr>
              <td>${tabla.idTablas}</td>
              <td>${tabla.nomProd}</td>
              <td>${tabla.tipoProd}</td>
              <td>${tabla.marcaProd}</td>
              <td>${tabla.matProd}</td>
              <td>${tabla.tamProd}</td>
              <td>${tabla.diseProd}</td>
              <td>${tabla.precioProd}</td>
            </tr>
          `
        });
      });
  }
  loadTablasList();
});
// Script obtener datos de back trajes

console.log("Entro a GetRequest");
document.addEventListener("DOMContentLoaded", function() {

  const trajesSection = document.getElementById("trajes");
  const trajes = [];

  function loadTrajesList() {
    console.log("Entro a loadTrajesList");
    fetch("/tiendasurf/trajes?action=getAll")
      .then(response => response.json())
      .then(data => {
        console.log("data : "+data);
        data.forEach(traje =>{
          trajes.push(traje);
          trajesSection.innerHTML += `
            <tr>
              <td>${traje.idTrajes}</td>
              <td>${traje.nomProd}</td>
              <td>${traje.tipoProd}</td>
              <td>${traje.marcaProd}</td>
              <td>${traje.tempProd}</td>
              <td>${traje.matProd}</td>
              <td>${traje.talleProd}</td>
              <td>${traje.tipCieProd}</td>
              <td>${traje.groProd}</td>
              <td>${traje.precioProd}</td>
            </tr>
          `
        });
      });
  }
  loadTrajesList();
});

// Script obtener datos de back Accesorios

console.log("Entro a GetRequest");
document.addEventListener("DOMContentLoaded", function() {

  const acceosriosSection = document.getElementById("accesorios");
  const accesorios = [];

  function loadAccesoriosList() {
    console.log("Entro a loadAccesoriosList");
    fetch("/tiendasurf/accesorios?action=getAll")
      .then(response => response.json())
      .then(data => {
        console.log("data : "+data);
        data.forEach(accesorio =>{
          accesorios.push(accesorio);
          acceosriosSection.innerHTML += `
            <tr>
              <td>${accesorio.idAccesorios}</td>
              <td>${accesorio.nomProd}</td>
              <td>${accesorio.tipoProd}</td>
              <td>${accesorio.marcaProd}</td>
              <td>${accesorio.pTrajProd}</td>
              <td>${accesorio.pTablaProd}</td>
              <td>${accesorio.otrosProd}</td>
               <td>${accesorio.precioProd}</td>
            </tr>
          `
        });
      });
  }
  loadAccesoriosList();
});


//FOOTER


let miFooter = `


    <div class="contendenorfooter">
    <div>
    <a class="afooter" href="index.html">Home</a>
    <a class="afooter" href="surf.html">Surf</a>
    <a class="afooter" href="contacto.html">Contacto</a>
    <a class="afooter" href="quienessomos.html">Quienes somos</a>


    <br><br>
    <h3>2024 Codo a Codo. All rights reserved (©).</h3>
    </div>
    
    
    
    

    </div>

    
    




`

document.querySelector("footer").innerHTML = miFooter;