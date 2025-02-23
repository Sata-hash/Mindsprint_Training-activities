const response = fetch('https://jsonplaceholder.typicode.com/users');

response.then(response => response.json())
.then(json => console.log(json))
.catch(err => console.log(err))
.finally(() => console.log('Promise Executed'))
