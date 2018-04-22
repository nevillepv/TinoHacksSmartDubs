#!pip3 install matplotlib pandas seaborn sklearn

#import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
#import seaborn as sns
import os
import glob
import sklearn.ensemble
#from sklearn.metrics import mean_absolute_error as mae

print(os.listdir('/Users/mainTriad/Downloads/Predictions/input/baseball'))

print (glob.glob('/Users/mainTriad/Downloads/Predictions/input/baseball/*team.csv'))

#print( df.info() )

df = pd.read_csv('/Users/mainTriad/Downloads/Predictions/input/baseball/team.csv')
df = df.dropna(axis=0);

redap = pd.read_csv('/Users/mainTriad/Downloads/Predictions/input/baseball/team.csv')
redap.drop( ['year', 'attendance', 'ipouts', 'fp', 'e', 'dp', 'soa', 'ab', 'ppf', 'bpf', 'bba', 'cg', 'sho', 'sv', 'ha', 'hra', 'hbp', 'sf', 'ra', 'er', 'era', 'hr', 'bb', 'so', 'sb', 'cs'], axis = 1, inplace = True )

#redap = redap[df.team_id_br == 'BOS']

#print( df )

#print(df.describe())

#df.drop( 'PassengerId', axis=1, inplace=True )

# redap.w.plot()
# plt.show()
#
# # print( df.w.describe() )
#
# redap.plot()
# plt.show()

# print( df.header() )

y = df.lg_win
X = df.loc[:,['w','l']]

model = sklearn.ensemble.RandomForestRegressor(max_depth=2, random_state=0)

model.fit(X, y)
r = 6

test = pd.read_csv('/Users/mainTriad/Downloads/Predictions/input/baseball/team_half.csv')

print(test.head(10))

test = df.head(100)

y = test.lg_win
X = test.loc[:,['w','l']]

print(model.predict( X ))

print('finished')


