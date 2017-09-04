//@ Kadane's Algorithm

def max_subarray(A):
    global_max = A[0]
    subarray_sum = A[0]
    m = len(A)
    for i in range(1,m):
        subarray_sum = max(A[i], subarray_sum + A[i])
        if subarray_sum>global_max:
            global_max = subarray_sum
    print(m)
    return global_max
    
    


// ----Exp ----
B = [5]
B = [1,2,3,4,5]
max_subarray(B)
