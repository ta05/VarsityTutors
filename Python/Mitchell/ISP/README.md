# Internet Service Provider

An Internet Service Provider (ISP) offers three packages to customers:

- **Package A** 10 hours of access for $9.95 per month. Additional hours are $2/hour
- **Package B** 20 hours of access for $14.95 per month. Additional hours are $1/hour
- **Package C** Unlimited access for $19.95 per month.

**Nonprofits** Nonprofit organizations receive a 20% discount on any package

Prompt the user for:

- Package (A, B or C)
- Nonprofit status (true/false, y/n, etc.)
- The total number of hours used

Calculate and display:

- The total charges
- The amount of money that package A customers would save with the packages B and C
- The amount of money that package B customers would save with the packages C

You are in the business of upselling. So, you do not need to compute if customers will save with lower packages. Here are example test cases

**Package** | **Hours** | **Nonprofit** | **Total**
A           |5          |Y              |$7.96, no savings with packages B or C
A           |25         |N              |$39.95,save $20 with package B and $20 with package C
B           |10         |Y              |$11.96, no savings with package C
B           |25         |N              |$19.95, no savings with package C
C           |18         |Y              |$15.96
C           |25         |N              |$19.95