#LC 412 : Fizz Buzz
def fizzBuzz(n):
    output = []
    for i in range(1, n+1):  # n+1 because 1-indexed
        if i % 3 == 0:
            ans = 'Fizz'
            if i % 5 == 0:
                ans += "Buzz"  # ans += because if divisible by 3 and 5, it will return FizzBuzz
        elif i % 5 == 0:
            ans = 'Buzz'
        else:
            ans = str(i)
        output.append(ans)
    return output


n = int(input("Enter a number: "))

result = fizzBuzz(n)
print("\n")
print(result)

        