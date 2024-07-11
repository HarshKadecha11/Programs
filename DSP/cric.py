import numpy as np
import tkinter as tk

# Data: Monthly sales figures for one year
sales_figures = np.array([1200, 1500, 1300, 1600, 1700, 1450, 1800, 1550, 1650, 1900, 2000, 1750])

# Calculating statistics
mean_sales = np.mean(sales_figures)
median_sales = np.median(sales_figures)
std_deviation = np.std(sales_figures)

# Identifying extremes
max_sales = np.max(sales_figures)
min_sales = np.min(sales_figures)
month_of_max_sales = np.argmax(sales_figures) + 1  # Adding 1 to match the actual month number
month_of_min_sales = np.argmin(sales_figures) + 1

# Creating the GUI window
window = tk.Tk()
window.title("Sales Statistics")

# Displaying results in the GUI
labels_text = [
	f"Mean Sales: {mean_sales}",
	f"Median Sales: {median_sales}",
	f"Standard Deviation of Sales: {std_deviation}",
	f"Highest Sales: {max_sales}, in Month: {month_of_max_sales}",
	f"Lowest Sales: {min_sales}, in Month: {month_of_min_sales}"
]

for text in labels_text:
	label = tk.Label(window, text=text, padx=10, pady=5)
	label.pack()

# Running the GUI loop
window.mainloop()