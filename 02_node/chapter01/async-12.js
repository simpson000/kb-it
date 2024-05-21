const order = (coffee, callback) => {
  console.log(`${coffee} 접수2`);
  setTimeout(() => {
    callback(coffee);
  }, 3000);
};
const display = (result) => {
  console.log(`${result} 완료`);
};

order('아아', display);
