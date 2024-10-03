import matplotlib.pyplot as plt
import numpy as np

# # x - axis
# x = [1,2,3]
#
# y = [2,4,1]
#
# plt.plot(x,y)
# plt.xlabel('x-axis')
# plt.ylabel('y-axis')
# plt.title('My First Graph')
# # plt.show()
#
# x = np.arange(0,10,0.1)
# y = np.cos(x)
#
# plt.figure(figsize=(10,8))
# plt.plot(x,y)
# # plt.show()



# #plot1
# x = np.array([0,1,2,3])
# y = np.array([4,5,6,7])
# plt.subplot(2,1,1)
# plt.plot(x,y,marker='*' , c='g' , ms=20 , mec='r' , mfc = 'b' , ls=":" ) # ms = marker size , c = color ,
#                         # mec = edge color of marker  , #mfc = face color of marker , ls = line style
#
# #plot2
#
# x = np.array([0,1,2,3])
# y = np.array([10,20,30,40])
# plt.subplot(2,1,2)
# plt.plot(x,y)
#
# plt.show()
# plt.tight_layout(pad=6)    # Layout gaps


# ypoint = np.array([3,8,1,10])
#
# plt.plot(ypoint , marker='o' , ms=20 , mec='r',mfc='g' , c='y' , ls='-.' , alpha=0.5) #alpha = Transparency
# # plt.show()


# x = [5,3,6,4,8]
# y = [0,6,3,5,2]
# plt.bar(x,y) # bar = for vertical plotting
# #barh = for horizontal plotting
# plt.show()


# x = [5,10,15,20,25,30,35]
# y = [1,4,3,2,7,6,8]
# plt.plot(x,y,'g')
# plt.xlabel('x')
# plt.ylabel('y')
#  # for setting the size for ticks , rotation and color value of extra things like scale of graph and bla bla .
# plt.title("Graph")
# plt.tick_params(axis="x" , labelsize=18 , labelrotation=-50 , labelcolor="Red")
# plt.tick_params(axis="y" , labelsize=20 , labelrotation=50 , labelcolor="Red")
#
# plt.show()


# y1 = [2,3,4.5]
# y2=[1,1.5,5]
# plt.plot(y1,label='line1' , color='blue')
#
# plt.plot(y2,label='line2' , color='yellow')
# plt.legend(labels = ['line1(blue)' , 'line2(green)'] , labelcolor=['green','black'] , loc="lower right" )
# plt.show()

# data=np.random.normal(170,10,250)
#
# # plt.hist(data)
# # plt.show()
# plt.hist(data,bins=30)
# plt.show()

# fig , ax = plt.subplots()
# x = np.linspace(0,20,1000)
# ax.plot(x , np.cos(x))
# ax.axis('equal')
#
# ax.annotate('local maximum' , xy=(10,2) , xytext=(4,5) , arrowprops=dict(facecolor='black' , shrink=0.05))
# ax.annotate('local minimum' , xy=(5* np.pi , -1) , xytext=(2,-6) , arrowprops=dict(arrowstyle="->" , connectionstyle="angle3,angleA=0,angleB=-270" )) ;
# plt.show()

# from mpl_toolkits import mplot3d
#
# fig = plt.figure()
# ax = plt.axes(projection='3d')
# z = np.linspace(0,1,1000)
# x = z*np.sin(25*z)
# y = z*np.cos(25*z)
#
# ax.plot3D(x,y,z,'green')
# ax.set_title('3D line plot')
# plt.show()

cars= ['AUDI' , 'BMW' , 'FORD' , 'TESLA' , 'JAGUAR' , 'MERCEDES']
data = [23,17,35,29,12,41]

fig = plt.figure(figsize=(10,7))
plt.pie(data,labels=cars)
plt.show()

