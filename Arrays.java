void main() {
    //------------------------------------------------------------------------
    // ARRAYS (definition, examples, common operations)
    //------------------------------------------------------------------------

    // Array declaration
    int[] arr1 = new int[5]; // creates array of size 5 (all default 0)
    int[] arr2 = {1, 2, 3, 4}; // array with initial values
    String[] names = new String[3]; // String array of size 3
    int arr3[] = new int[]{};

    // Accessing elements
    arr2[0]; // 1 --> access first element
    arr2[2]; // 3 --> access element at index 2

    // Modifying elements
    arr2[1] = 10; // arr2 becomes {1,10,3,4}

    // Length of array
    arr2.length; // 4 --> number of elements

    // Looping through array
    for (int i = 0; i < arr2.length; i++) {
        int x = arr2[i]; // normal for-loop
    }

    for (int x : arr2) { // enhanced for-loop
        x = x; // iterate over values
    }

    // Copying arrays
    int[] copy = Arrays.copyOf(arr2, arr2.length); // create full copy
    int[] part = Arrays.copyOfRange(arr2, 1, 3); // copy from index 1 to 2

    // Sorting
    Arrays.sort(arr2); // sorts array in ascending order

    // Searching
    Arrays.binarySearch(arr2, 3); // returns index of element 3 (array must be sorted)

    // Filling array
    Arrays.fill(arr1, 7); // arr1 becomes {7,7,7,7,7}

    // Converting to String
    Arrays.toString(arr2); // prints array like [1, 2, 3, 4]
}