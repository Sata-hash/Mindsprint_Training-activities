def addTodo(myTodo):
    task = input("Enter the task to add :")
    myTodo.append(task)


def remTodo(myTodo):
    task = input("Enter the Task to remove : ")
    myTodo.remove(task)

def getTodo(myTodo):
    print("Todo List :")
    for task in myTodo:
        print(task)    


myTodo = []

while(True):
    print("1. Add Todo \n2. Remove Todo \n3. Get All Todos \n4. Exit")
    choice = int(input("Enter your Choice : "))

    if choice == 1:
        addTodo(myTodo)
    elif choice == 2:
        remTodo(myTodo)
    elif choice == 3:
        getTodo(myTodo)
    elif choice == 4:
        break
    else :
        print("choose Correct Operation")    


    # switch (choice)
    #     case 1 :
    #         addTodo()
    #     case 2 :
    #         remTodo()
    #     case 3 :
    #         getTodo()
    #     case 4 : 
    #         break
           


