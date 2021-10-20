import threading
import time

def parent():
    for i in range(5):
        print('parent',i+1)
        time.sleep(1)
    print(threading.current_thread())
    

def children1():
    for i in range(6,11):
        print('children1',i+1)
        time.sleep(1)
    print(threading.current_thread(),"\n")

def children2():
    for i in range(11,16):
        print('children2',i+1)
        time.sleep(1)
    print(threading.current_thread(),"\n")

thread1=threading.Thread(target=parent)
thread2=threading.Thread(target=children1)
thread3=threading.Thread(target=children2)

threads=[]
threads.append(thread1)
threads.append(thread2)
threads.append(thread3)

for i in threads:
    i.start()

for i in threads:
    i.join()
