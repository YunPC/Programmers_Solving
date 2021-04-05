def solution(genres, plays):
    ht1 = dict()
    ht2 = dict()

    for i, elem in enumerate(zip(genres, plays)):
        g, p = elem
        if g not in ht1:
            ht1[g] = 0
            ht[g] = []

        ht1[g] += p
        ht2[g].append((i, p))
                    #(g,p)              # -p 내림차순!
    sort_ht1 = sorted(list(ht1.items()), key = lambda x: -x[1])
    
    for g,p in sort_ht1:
        sort_ht2 = sorted(ht2[g], key= lambda x: -x[1])
        answer += list(map(lambda x : x[0], sort_ht2))[:2]

    return answer