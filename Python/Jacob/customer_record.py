def file_copy(fh_1, fh_2):
    """
    ------------------------------------------------------------------
    Copies the contents of fh_1 to fh_2.
    Any contents of fh_2 are overwritten.
    Use file_copy(fh_1, fh_2)
    ------------------------------------------------------------------
    Parameters:
        fh_1 - source file (file handle - already open for reading)
        fh_2 - target file (file handle - already open for writing)
    Returns:
        None
    ------------------------------------------------------------------
    """
    fh_2.write(fh_1.read())


def customer_record(fh, n):
    """
    -------------------------------------------------------------------
    Find the n-th record in a comma-delimited sequential file.
    Records are numbered starting with 0.
    Use: result - customer_record(fh, n)
    -------------------------------------------------------------------
    Parameters:
        fh - file to search (file handle - already open for reading)
        n - the number of the record to return (int > n)
    Returns:
        result - a list of the fields of the n-th record if it exists
            and an empty list otherwise (list)
    -------------------------------------------------------------------
    """
    lines = fh.read().splitlines()
    return lines[n].split(",") if n < len(lines) else []

if __name__ == "__main__":
    in_file = open("./Jacob/files/words.txt", "r")
    out_file = open("./Jacob/files/words2.txt", "w")
    file_copy(in_file, out_file)
    in_file.close()
    out_file.close()
    
    customer_file = open("./Jacob/files/customers.txt", "r")
    print("Find record n")
    n = int(input("Enter a record number: "))
    print(customer_record(customer_file, n))
    customer_file.close()