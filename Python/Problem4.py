# /*
# A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
# Find the largest palindrome made from the product of two 3-digit numbers.
# */

def validar(product,num_a,num_b):
    x = [int(e) for e in str(product)]#List Comprehension
    #print(x)
    if(x[0]==x[5] and x[1]==x[4] and x[2]==x[3]):
        print("Numbers that generate palindrome: ", num_a,"*",num_b,"= ",x)
        lista.append(product)
    
def product_numbers(number_a, number_b):
    while (number_b >= 900):
        #print(number_b,number_a)
        if (number_a >= 900):
            product = number_a * number_b 
            #print(product)
            validar(product,number_a,number_b)
            number_a -= 1
        else:
            number_b -= 1
            number_a = 999

if __name__ == '__main__':
    print("Start Solution")
    lista = []
    product = 0
    product_numbers(number_a=999, number_b=999)
    print("List with all palindrome numbers: ")
    print(lista)
    print("The largest palindrome number is product of largest 3-digit numbers is: ", max(lista))