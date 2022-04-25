""" /*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
"""
import math

number =600851475143
sqrt = math.ceil(math.sqrt(number))#I have to use ceil because I want to have a number without decimals
print("Square root from long number is:",sqrt)
prime_factor = 0
divisor = 2
while(divisor <= sqrt):
    if (number % divisor == 0):#If this condition is true, it is deployed all statements then out directly to the while 
        prime_factor = divisor
        number = number // divisor #two of // in order to discard decimals numbers
        print("Multiple of long number: ",number)
    elif (number == 1):
        print("The largest prime_factor is: ", prime_factor)
        break
    else:
        divisor += 1