void main() {
    //------------------------------------------------------------------------
    // CONTROL FLOW (if, loops, switch)
    //------------------------------------------------------------------------

    // IF / ELSE
    int x = 10;
    if (x > 5) { // checks condition
        // executes if true
    } else if (x == 5) { // optional else-if
        // executes if this matches
    } else { // fallback
        // executes if all above fail
    }

    // SWITCH
    int day = 2;
    switch (day) { // compares value against cases
        case 1: // if day == 1
                // code
            break; // stops fall-through
        case 2:
                // code
            break;
        default: // runs if no case matches
                // code
    }

    // FOR LOOP
    for (int i = 0; i < 5; i++) { // init; condition; update
        // repeats 5 times
    }
    // ADV FOR LOOP
    int a[] = new int[4];
    for(int e : a){
        //runs for each element e;
    }

    // WHILE LOOP
    while (x < 20) { // runs while condition is true
        x++;
    }

    // DO-WHILE LOOP
    // executes at least once
    int y = 0;
    do {
        y++;
    } while (y < 5);


    // BREAK
    for (int i = 0; i < 10; i++) {
        if (i == 5) break; // exits the loop immediately
    }


    // CONTINUE
    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) continue; // skips even numbers, moves to next loop iteration
    }
}