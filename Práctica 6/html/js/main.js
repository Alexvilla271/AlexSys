var bLogueo= document.getElementById('signin');
bLogueo.addEventListener('click', function() {
    
    //alert('Hola ' + document.getElementById('email').value)
    
    const parametros= new URLSearchParams();
    parametros.append('Prtemail', document.getElementById('email').value);
    parametros.append('Prtpassword', document.getElementById('password').value);
    //alert (parametros);
    axios.get('http://127.0.0.1:4567', parametros);
    .then(function (response){
        console.log(response)
    })
    .catch(function (error){
        console.log(error)
    })

})