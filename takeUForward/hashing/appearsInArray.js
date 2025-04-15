function timesItAppers() {
    const arr = [1, 2, 3, 1, 3, 2, 5]
    const find = 2
    let timesAppers = new Map();
    for (let i = 0; i < arr.length; i++) {
        if (timesAppers.has(arr[i]))
            timesAppers.set(arr[i], timesAppers.get(arr[i]) + 1)
        else {
            timesAppers.set(arr[i], 1)
        }
    }
    console.log(timesAppers)
}

function maxMinFreq() {
    const arr = [1, 2, 3, 1, 3, 3, 3, 2, 5]
    const appear = new Map();
    for (let a of arr) {
        if (appear.has(a))
            appear.set(a, appear.get(a) + 1)
        else
            appear.set(a, 1)
    }
    let maxFreq = -Infinity, minFreq = Infinity, maxVal, minVal
    for (let [val, freq] of appear) {
        if (freq > maxFreq) {
            maxFreq = freq
            maxVal = val
        }
        if (freq < minFreq) {
            minFreq = freq
            minVal = val
        }

    }
    console.log({ maxFreq, maxVal, minFreq, minVal })
}
maxMinFreq()