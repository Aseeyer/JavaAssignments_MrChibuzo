for number in range(1, 11):
    square = 1
    sum_square = 0
    if number % 4 == 0:
        for loop in range(1, 6):
            square *= number
            sum_square += square
        print(sum_square, end=" ")
        
        