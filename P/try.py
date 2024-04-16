import psutil
import tkinter as tk

def update_stats():
    cpu_usage = psutil.cpu_percent(interval=1)
    memory_info = psutil.virtual_memory()
    disk_usage = psutil.disk_usage('/')
    network_info = psutil.net_io_counters()

    cpu_label.config(text=f"CPU Usage: {cpu_usage}%")
    memory_label.config(text=f"Memory Usage: {memory_info.percent}%")
    disk_label.config(text=f"Disk Usage: {disk_usage.percent}%")
    network_label.config(text=f"Network Info: {network_info}")

    root.after(1000, update_stats)

root = tk.Tk()

cpu_label = tk.Label(root)
cpu_label.pack()
memory_label = tk.Label(root)
memory_label.pack()
disk_label = tk.Label(root)
disk_label.pack()
network_label = tk.Label(root)
network_label.pack()

update_stats()

root.mainloop()