# /*
# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
# */

# Python Program to find the L.C.M. of number list
def compute_lcm(x, y):
   if x > y:
       greater = x
   else:
       greater = y

   while(True):
       if((greater % x == 0) and (greater % y == 0)):
           lcm = greater
           resultado_lcm.append(lcm)
           print("Calculation of lcm: ",lcm)
           break
       greater += 1

   return lcm

def lcm_numbers(num1,num2):
    print("Elements in list: ",lista)
    lcm_var = compute_lcm(num1,num2)
    print("First lcm: ", lcm_var)
    while (len(lista) > 2):
        i = 2
        print("Iterator should start for list with size more than 2 in: ")
        while ((i) < len(lista)):
            print("Iterator: ",i)
            num1= lcm_var
            num2= lista[i]    
            print("Numbers for calculate the lcm:")
            print(num1, num2)
            lcm_var = compute_lcm(num1,num2)
            i += 1
        break
        
if __name__ == '__main__':
    resultado_lcm = []
    print("Start Solution")
    lista = list(range(1,21))
    num_a = lista[0]
    num_b = lista[1]
    print("Size list: ",len(lista))
    print("Go to calculation: ")
    lcm_numbers(num_a,num_b)
    print("Result the L.C.M. for all numbers in the list: ", max(resultado_lcm))