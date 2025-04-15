/**
 * pick a element and place it in correct order
 * 
 * [1,2,8,3,7,4] 
 *  pick 1 no change
 *  pick  1,2 no change
 *  pick 1,2,8 no change
 *  pick 1,2,8,3  3 move to index 2 
 *  
 * Time Complexity
 *  worst/avg = O(n^2)
 *  best = O(n) // on sort array no swap and while loop not going to run
 * 
 */
function insertionSort(){
    const arr = [9,8,7,6,5,4,3,2,1] 
    for(let i=0;i<arr.length;i++){
        let j =i
        while(j != 0 && arr[j-1] > arr[j] ){
            //swap
            const temp = arr[j]
            arr[j] = arr[j-1]
            arr[j-1] = temp
            //check need to swap
            j--;
        }
    }
    console.log(arr)
}
insertionSort()