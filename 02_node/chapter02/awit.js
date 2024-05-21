async function init() {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/users');
    // console.log(response);
    const users = await response.json();
    console.log(users);
  } catch (err) {
    console.log(err);
  }
}
init();
