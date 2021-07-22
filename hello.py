from Eir import SIR

beta = 1.2
gamma = .15
S0 = 999999
I0 = 1
R0 = 0

sim = SIR(beta=beta, gamma=gamma, S0=S0, I0=I0, R0=R0)
df, fig = sim.run(days=31, dt=0.1)

print(df)
