import numpy as np

def rankings(filename, university):
    filedata = np.genfromtxt(filename, delimiter=',', dtype='str')
    
    rows = np.where(filedata == university)[0]

    return filedata[rows][:,0]