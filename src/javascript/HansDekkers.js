var hans = function (a,b) {
  if (a > b) hans(b,a);
  else {
    for (let i = 0; i <= 1000; i++) {
      if (i % a == 0 && i % b == 0) console.log('HANS DEKKERS');
      else if (i % b == 0) console.log('DEKKERS');
      else if (i % a == 0) console.log('HANS');
      else console.log(i);
    }
  }
}
