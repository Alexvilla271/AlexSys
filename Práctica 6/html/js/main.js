var bLogueo= document.getElementById('signin');
bLogueo.addEventListener('click', function() {
    
    //alert('Hola ' + document.getElementById('email').value)
    
    const parametros= new URLSearchParams();
    parametros.append('Prtemail', document.getElementById('email').value);
    parametros.append('Prtpassword', document.getElementById('password').value);
    //alert (parametros);
    //axios.get('http://127.0.0.1:4567/hello/'+parametros, parametros);

    axios.post('http://127.0.0.1:4567/otro',{
        prt
    })

    .then(function (response){
        console.log(response)
        console.log(response.data)
        console.log(response.status)
        document.getElementById('titulo').innerHTML= response.data
    })
    .catch(function (error){
        console.log(error)
    })

})