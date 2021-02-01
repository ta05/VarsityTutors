function stretch(count, index, array, result) {
    if (array.length === 0 || index >= array.length)
    {
        return result;
        }
    if (count > 0) {
        result.push(array[index])
        return stretch(count - 1, index, array, result);
    } else if (count == 0) {
        return stretch(index + 2, index + 1, array, result);
    }
}

function runStretch(array) {
    return stretch(1, 0, array, []);
}

console.log(runStretch([9,8,7,6,5]));