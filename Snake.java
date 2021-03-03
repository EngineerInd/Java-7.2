config,d,s,l=input().split(","),{},0,0
for c in config:
  r=c.split(":")
  d[int(r[0])]=int(r[1])
for k in d:
  if d[k]>k:
    l=l+1
  else:
    s=s+1
print(*[s,l],end="")
