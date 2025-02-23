async function fetchData(){
    try{
        const res = await fetch('https://jsonplaceholder.typicode.com/users');
        const json = await res.json();
        console.log(json[2]);
    }
    catch(err){
        console.log('Error Occurred', err);
    }
}

fetchData();