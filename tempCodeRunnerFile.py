def solve(N, K, parents, earning_members):
    salary_keeper = set()

    for earning_member in earning_members:
        current_member = earning_member
        while current_member != -1 and current_member not in salary_keeper:
            salary_keeper.add(current_member)
            current_member = parents[current_member]

    return sorted(list(salary_keeper))

# Input reading and function call
N = int(input())
K = int(input())
parents = list(map(int, input().split()))
earning_members = list(map(int, input().split()))
out_ = solve(N, K, parents, earning_members)
print(' '.join(map(str, out_)))
