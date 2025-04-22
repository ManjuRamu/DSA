const a = [1, 1, 2, 3, 4, 5, 6, 12, 14, 15];
const b = [1, 2, 4, 4, 4, 4, 6, 6, 7, 8];
const res = [];
let i = 0,
  j = 0;
while (i < a.length && j < b.length) {
  let e;
  if (a[i] <= b[j]) {
    e = a[i];
    i++;
  } else {
    e = b[j];
    j++;
  }
  if (res[res.length - 1] != e) {
    res.push(e);
  }
}
while (i < a.length) {
  if (res[res.length - 1] != a[i]) {
    res.push(a[i]);
  }
  i++;
}
while (j < b.length) {
  if (res[res.length - 1] != b[j]) {
    res.push(b[j]);
  }
  j++;
}
console.log(res);
