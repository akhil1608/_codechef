t = input();
for i in range(0,t):
    nq = [int(x) for x in raw_input().split()]
    n=nq[0];
    q=nq[1];
    l = [int(x) for x in raw_input().split()]
    l.sort();
    for i in range (0,q):
        k = input();
        if l[0] >= k :
            c = n;
        elif (l[n-1]+(n-1)) < k :
            c = 0;
        else :
            a = next(x[0] for x in enumerate(l) if x[1] >= k)-1;
            c=n-a-1;
            for i in range(a,0,-1):
                if (k-l[i]) <= a :
                    a-=k-l[i]+1;
                    c=c+1;
                else :
                    break;
        print(c);