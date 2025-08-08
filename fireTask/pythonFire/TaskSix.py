for number in range(1, 11):
    square = 1;
    if number % 4 == 0:
        for loop in range(1, 6):
            square *= number
            print(square, end=" ")
        
        