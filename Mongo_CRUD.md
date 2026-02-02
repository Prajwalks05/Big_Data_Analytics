# Operations done on Lab 1
```
Microsoft Windows [Version 10.0.26100.7623]
(c) Microsoft Corporation. All rights reserved.

C:\Windows\System32>use socialmedia
'use' is not recognized as an internal or external command,
operable program or batch file.

C:\Windows\System32>mongosh "mongodb+srv://cluster0.cuijdov.mongodb.net/" --apiVersion 1 --username prajwal
Enter password: *******
Current Mongosh Log ID: 69806fde97ba0ea3691e2620
Connecting to:          mongodb+srv://<credentials>@cluster0.cuijdov.mongodb.net/?appName=mongosh+2.5.10
MongoNetworkError: 042D0000:error:0A000438:SSL routines:ssl3_read_bytes:tlsv1 alert internal error:C:\data\mci\eb36\tmp\boxednode\mongosh\node-v20.19.6\deps\openssl\openssl\ssl\record\rec_layer_s3.c:1605:SSL alert number 80


C:\Windows\System32>mongosh "mongodb+srv://cluster0.cuijdov.mongodb.net/" --apiVersion 1 --username prajwal
Enter password: *******
Current Mongosh Log ID: 6980703e38f8f1566a1e2620
Connecting to:          mongodb+srv://<credentials>@cluster0.cuijdov.mongodb.net/?appName=mongosh+2.5.10
Using MongoDB:          8.0.18 (API Version 1)
Using Mongosh:          2.5.10
mongosh 2.6.0 is available for download: https://www.mongodb.com/try/download/shell

For mongosh info see: https://www.mongodb.com/docs/mongodb-shell/
```
### Creating new DB
```
Atlas atlas-ryqrm6-shard-0 [primary] test> use socialmedia
...
switched to db socialmedia
```
### Inserting Values
```
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.SocialMediaData.insertMany([
...  {User_ID:"U101", Page_ID:"P001", Likes:15, Shares:5, Comments:3, Page_Visits:120, Date:new Date("2026-01-01")},
...  {User_ID:"U102", Page_ID:"P001", Likes:20, Shares:10, Comments:6, Page_Visits:150, Date:new Date("2026-01-01")},
...  {User_ID:"U103", Page_ID:"P002", Likes:8, Shares:2, Comments:1, Page_Visits:90, Date:new Date("2026-01-01")},
...  {User_ID:"U104", Page_ID:"P002", Likes:25, Shares:12, Comments:10, Page_Visits:200, Date:new Date("2026-01-02")},
...  {User_ID:"U105", Page_ID:"P003", Likes:30, Shares:18, Comments:12, Page_Visits:300, Date:new Date("2026-01-02")},
...  {User_ID:"U106", Page_ID:"P001", Likes:5, Shares:1, Comments:0, Page_Visits:60, Date:new Date("2026-01-02")},
...  {User_ID:"U107", Page_ID:"P003", Likes:40, Shares:20, Comments:15, Page_Visits:400, Date:new Date("2026-01-03")},
...  {User_ID:"U108", Page_ID:"P002", Likes:12, Shares:4, Comments:2, Page_Visits:110, Date:new Date("2026-01-03")},
...  {User_ID:"U109", Page_ID:"P003", Likes:22, Shares:9, Comments:7, Page_Visits:210, Date:new Date("2026-01-03")},
...  {User_ID:"U110", Page_ID:"P001", Likes:18, Shares:6, Comments:4, Page_Visits:140, Date:new Date("2026-01-03")}
... ])
...
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId('6980709f38f8f1566a1e2621'),
    '1': ObjectId('6980709f38f8f1566a1e2622'),
    '2': ObjectId('6980709f38f8f1566a1e2623'),
    '3': ObjectId('6980709f38f8f1566a1e2624'),
    '4': ObjectId('6980709f38f8f1566a1e2625'),
    '5': ObjectId('6980709f38f8f1566a1e2626'),
    '6': ObjectId('6980709f38f8f1566a1e2627'),
    '7': ObjectId('6980709f38f8f1566a1e2628'),
    '8': ObjectId('6980709f38f8f1566a1e2629'),
    '9': ObjectId('6980709f38f8f1566a1e262a')
  }
}
```
### print all
```
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.SocialMediaData.find().pretty()
...
[
  {
    _id: ObjectId('6980709f38f8f1566a1e2621'),
    User_ID: 'U101',
    Page_ID: 'P001',
    Likes: 15,
    Shares: 5,
    Comments: 3,
    Page_Visits: 120,
    Date: ISODate('2026-01-01T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2622'),
    User_ID: 'U102',
    Page_ID: 'P001',
    Likes: 20,
    Shares: 10,
    Comments: 6,
    Page_Visits: 150,
    Date: ISODate('2026-01-01T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2623'),
    User_ID: 'U103',
    Page_ID: 'P002',
    Likes: 8,
    Shares: 2,
    Comments: 1,
    Page_Visits: 90,
    Date: ISODate('2026-01-01T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2624'),
    User_ID: 'U104',
    Page_ID: 'P002',
    Likes: 25,
    Shares: 12,
    Comments: 10,
    Page_Visits: 200,
    Date: ISODate('2026-01-02T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2625'),
    User_ID: 'U105',
    Page_ID: 'P003',
    Likes: 30,
    Shares: 18,
    Comments: 12,
    Page_Visits: 300,
    Date: ISODate('2026-01-02T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2626'),
    User_ID: 'U106',
    Page_ID: 'P001',
    Likes: 5,
    Shares: 1,
    Comments: 0,
    Page_Visits: 60,
    Date: ISODate('2026-01-02T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2627'),
    User_ID: 'U107',
    Page_ID: 'P003',
    Likes: 40,
    Shares: 20,
    Comments: 15,
    Page_Visits: 400,
    Date: ISODate('2026-01-03T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2628'),
    User_ID: 'U108',
    Page_ID: 'P002',
    Likes: 12,
    Shares: 4,
    Comments: 2,
    Page_Visits: 110,
    Date: ISODate('2026-01-03T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e2629'),
    User_ID: 'U109',
    Page_ID: 'P003',
    Likes: 22,
    Shares: 9,
    Comments: 7,
    Page_Visits: 210,
    Date: ISODate('2026-01-03T00:00:00.000Z')
  },
  {
    _id: ObjectId('6980709f38f8f1566a1e262a'),
    User_ID: 'U110',
    Page_ID: 'P001',
    Likes: 18,
    Shares: 6,
    Comments: 4,
    Page_Visits: 140,
    Date: ISODate('2026-01-03T00:00:00.000Z')
  }
]
```
### insert to creator table
```
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Creators.insertMany([
...  {Creator_ID:"C101", Creator_Name:"Alice", Platform:"Instagram", Category:"Fashion", Country:"India"},
...  {Creator_ID:"C102", Creator_Name:"Bob", Platform:"YouTube", Category:"Tech", Country:"USA"},
...  {Creator_ID:"C103", Creator_Name:"Charlie", Platform:"Twitter", Category:"News", Country:"UK"},
...  {Creator_ID:"C104", Creator_Name:"Diana", Platform:"Instagram", Category:"Food", Country:"India"},
...  {Creator_ID:"C105", Creator_Name:"Ethan", Platform:"YouTube", Category:"Gaming", Country:"Canada"}
... ])
...
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId('698070cd38f8f1566a1e262b'),
    '1': ObjectId('698070cd38f8f1566a1e262c'),
    '2': ObjectId('698070cd38f8f1566a1e262d'),
    '3': ObjectId('698070cd38f8f1566a1e262e'),
    '4': ObjectId('698070cd38f8f1566a1e262f')
  }
}
```
### Printing all values
```
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Creators.find().pretty()
...
[
  {
    _id: ObjectId('698070cd38f8f1566a1e262b'),
    Creator_ID: 'C101',
    Creator_Name: 'Alice',
    Platform: 'Instagram',
    Category: 'Fashion',
    Country: 'India'
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262c'),
    Creator_ID: 'C102',
    Creator_Name: 'Bob',
    Platform: 'YouTube',
    Category: 'Tech',
    Country: 'USA'
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262d'),
    Creator_ID: 'C103',
    Creator_Name: 'Charlie',
    Platform: 'Twitter',
    Category: 'News',
    Country: 'UK'
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262e'),
    Creator_ID: 'C104',
    Creator_Name: 'Diana',
    Platform: 'Instagram',
    Category: 'Food',
    Country: 'India'
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262f'),
    Creator_ID: 'C105',
    Creator_Name: 'Ethan',
    Platform: 'YouTube',
    Category: 'Gaming',
    Country: 'Canada'
  }
]
```
### Insert to ADS table
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Ads.insertMany([
...  {Ad_ID:"A001", Creator_ID:"C101", Page_ID:"P001", Likes:150, Shares:50, Comments:30, Page_Visits:1200, Ad_Date:new Date("2026-01-01"), Revenue:2500.50},
...  {Ad_ID:"A002", Creator_ID:"C102", Page_ID:"P002", Likes:200, Shares:80, Comments:45, Page_Visits:1800, Ad_Date:new Date("2026-01-01"), Revenue:4000.00},
...  {Ad_ID:"A003", Creator_ID:"C103", Page_ID:"P003", Likes:90, Shares:20, Comments:10, Page_Visits:700, Ad_Date:new Date("2026-01-01"), Revenue:1200.75},
...  {Ad_ID:"A004", Creator_ID:"C104", Page_ID:"P004", Likes:300, Shares:120, Comments:60, Page_Visits:2500, Ad_Date:new Date("2026-01-02"), Revenue:5200.00},
...  {Ad_ID:"A005", Creator_ID:"C105", Page_ID:"P005", Likes:400, Shares:200, Comments:100, Page_Visits:3000, Ad_Date:new Date("2026-01-02"), Revenue:7500.25},
...  {Ad_ID:"A006", Creator_ID:"C101", Page_ID:"P006", Likes:180, Shares:70, Comments:35, Page_Visits:1500, Ad_Date:new Date("2026-01-02"), Revenue:3000.00},
...  {Ad_ID:"A007", Creator_ID:"C102", Page_ID:"P007", Likes:220, Shares:90, Comments:55, Page_Visits:2000, Ad_Date:new Date("2026-01-03"), Revenue:4500.50},
...  {Ad_ID:"A008", Creator_ID:"C103", Page_ID:"P008", Likes:100, Shares:25, Comments:15, Page_Visits:800, Ad_Date:new Date("2026-01-03"), Revenue:1500.00},
...  {Ad_ID:"A009", Creator_ID:"C104", Page_ID:"P009", Likes:350, Shares:150, Comments:75, Page_Visits:2700, Ad_Date:new Date("2026-01-03"), Revenue:6000.00},
...  {Ad_ID:"A010", Creator_ID:"C105", Page_ID:"P010", Likes:500, Shares:250, Comments:150, Page_Visits:3500, Ad_Date:new Date("2026-01-03"), Revenue:9000.00}
... ])
...
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId('698070dc38f8f1566a1e2630'),
    '1': ObjectId('698070dc38f8f1566a1e2631'),
    '2': ObjectId('698070dc38f8f1566a1e2632'),
    '3': ObjectId('698070dc38f8f1566a1e2633'),
    '4': ObjectId('698070dc38f8f1566a1e2634'),
    '5': ObjectId('698070dc38f8f1566a1e2635'),
    '6': ObjectId('698070dc38f8f1566a1e2636'),
    '7': ObjectId('698070dc38f8f1566a1e2637'),
    '8': ObjectId('698070dc38f8f1566a1e2638'),
    '9': ObjectId('698070dc38f8f1566a1e2639')
  }
}
```
### printing all
```
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Ads.find().pretty()
...
[
  {
    _id: ObjectId('698070dc38f8f1566a1e2630'),
    Ad_ID: 'A001',
    Creator_ID: 'C101',
    Page_ID: 'P001',
    Likes: 150,
    Shares: 50,
    Comments: 30,
    Page_Visits: 1200,
    Ad_Date: ISODate('2026-01-01T00:00:00.000Z'),
    Revenue: 2500.5
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2631'),
    Ad_ID: 'A002',
    Creator_ID: 'C102',
    Page_ID: 'P002',
    Likes: 200,
    Shares: 80,
    Comments: 45,
    Page_Visits: 1800,
    Ad_Date: ISODate('2026-01-01T00:00:00.000Z'),
    Revenue: 4000
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2632'),
    Ad_ID: 'A003',
    Creator_ID: 'C103',
    Page_ID: 'P003',
    Likes: 90,
    Shares: 20,
    Comments: 10,
    Page_Visits: 700,
    Ad_Date: ISODate('2026-01-01T00:00:00.000Z'),
    Revenue: 1200.75
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2633'),
    Ad_ID: 'A004',
    Creator_ID: 'C104',
    Page_ID: 'P004',
    Likes: 300,
    Shares: 120,
    Comments: 60,
    Page_Visits: 2500,
    Ad_Date: ISODate('2026-01-02T00:00:00.000Z'),
    Revenue: 5200
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2634'),
    Ad_ID: 'A005',
    Creator_ID: 'C105',
    Page_ID: 'P005',
    Likes: 400,
    Shares: 200,
    Comments: 100,
    Page_Visits: 3000,
    Ad_Date: ISODate('2026-01-02T00:00:00.000Z'),
    Revenue: 7500.25
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2635'),
    Ad_ID: 'A006',
    Creator_ID: 'C101',
    Page_ID: 'P006',
    Likes: 180,
    Shares: 70,
    Comments: 35,
    Page_Visits: 1500,
    Ad_Date: ISODate('2026-01-02T00:00:00.000Z'),
    Revenue: 3000
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2636'),
    Ad_ID: 'A007',
    Creator_ID: 'C102',
    Page_ID: 'P007',
    Likes: 220,
    Shares: 90,
    Comments: 55,
    Page_Visits: 2000,
    Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
    Revenue: 4500.5
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2637'),
    Ad_ID: 'A008',
    Creator_ID: 'C103',
    Page_ID: 'P008',
    Likes: 100,
    Shares: 25,
    Comments: 15,
    Page_Visits: 800,
    Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
    Revenue: 1500
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2638'),
    Ad_ID: 'A009',
    Creator_ID: 'C104',
    Page_ID: 'P009',
    Likes: 350,
    Shares: 150,
    Comments: 75,
    Page_Visits: 2700,
    Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
    Revenue: 6000
  },
  {
    _id: ObjectId('698070dc38f8f1566a1e2639'),
    Ad_ID: 'A010',
    Creator_ID: 'C105',
    Page_ID: 'P010',
    Likes: 500,
    Shares: 250,
    Comments: 150,
    Page_Visits: 3500,
    Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
    Revenue: 9000
  }
]
```
# Some join QUERIES
```
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> //Q1 Show all details of a content creator with all ads associated (MongoDB)

Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Creators.aggregate([
...  {
...    $lookup: {
...      from: "Ads",
...      localField: "Creator_ID",
...      foreignField: "Creator_ID",
...      as: "Ads_Details"
...    }
...  }
... ])
...
[
  {
    _id: ObjectId('698070cd38f8f1566a1e262b'),
    Creator_ID: 'C101',
    Creator_Name: 'Alice',
    Platform: 'Instagram',
    Category: 'Fashion',
    Country: 'India',
    Ads_Details: [
      {
        _id: ObjectId('698070dc38f8f1566a1e2630'),
        Ad_ID: 'A001',
        Creator_ID: 'C101',
        Page_ID: 'P001',
        Likes: 150,
        Shares: 50,
        Comments: 30,
        Page_Visits: 1200,
        Ad_Date: ISODate('2026-01-01T00:00:00.000Z'),
        Revenue: 2500.5
      },
      {
        _id: ObjectId('698070dc38f8f1566a1e2635'),
        Ad_ID: 'A006',
        Creator_ID: 'C101',
        Page_ID: 'P006',
        Likes: 180,
        Shares: 70,
        Comments: 35,
        Page_Visits: 1500,
        Ad_Date: ISODate('2026-01-02T00:00:00.000Z'),
        Revenue: 3000
      }
    ]
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262c'),
    Creator_ID: 'C102',
    Creator_Name: 'Bob',
    Platform: 'YouTube',
    Category: 'Tech',
    Country: 'USA',
    Ads_Details: [
      {
        _id: ObjectId('698070dc38f8f1566a1e2631'),
        Ad_ID: 'A002',
        Creator_ID: 'C102',
        Page_ID: 'P002',
        Likes: 200,
        Shares: 80,
        Comments: 45,
        Page_Visits: 1800,
        Ad_Date: ISODate('2026-01-01T00:00:00.000Z'),
        Revenue: 4000
      },
      {
        _id: ObjectId('698070dc38f8f1566a1e2636'),
        Ad_ID: 'A007',
        Creator_ID: 'C102',
        Page_ID: 'P007',
        Likes: 220,
        Shares: 90,
        Comments: 55,
        Page_Visits: 2000,
        Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
        Revenue: 4500.5
      }
    ]
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262d'),
    Creator_ID: 'C103',
    Creator_Name: 'Charlie',
    Platform: 'Twitter',
    Category: 'News',
    Country: 'UK',
    Ads_Details: [
      {
        _id: ObjectId('698070dc38f8f1566a1e2632'),
        Ad_ID: 'A003',
        Creator_ID: 'C103',
        Page_ID: 'P003',
        Likes: 90,
        Shares: 20,
        Comments: 10,
        Page_Visits: 700,
        Ad_Date: ISODate('2026-01-01T00:00:00.000Z'),
        Revenue: 1200.75
      },
      {
        _id: ObjectId('698070dc38f8f1566a1e2637'),
        Ad_ID: 'A008',
        Creator_ID: 'C103',
        Page_ID: 'P008',
        Likes: 100,
        Shares: 25,
        Comments: 15,
        Page_Visits: 800,
        Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
        Revenue: 1500
      }
    ]
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262e'),
    Creator_ID: 'C104',
    Creator_Name: 'Diana',
    Platform: 'Instagram',
    Category: 'Food',
    Country: 'India',
    Ads_Details: [
      {
        _id: ObjectId('698070dc38f8f1566a1e2633'),
        Ad_ID: 'A004',
        Creator_ID: 'C104',
        Page_ID: 'P004',
        Likes: 300,
        Shares: 120,
        Comments: 60,
        Page_Visits: 2500,
        Ad_Date: ISODate('2026-01-02T00:00:00.000Z'),
        Revenue: 5200
      },
      {
        _id: ObjectId('698070dc38f8f1566a1e2638'),
        Ad_ID: 'A009',
        Creator_ID: 'C104',
        Page_ID: 'P009',
        Likes: 350,
        Shares: 150,
        Comments: 75,
        Page_Visits: 2700,
        Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
        Revenue: 6000
      }
    ]
  },
  {
    _id: ObjectId('698070cd38f8f1566a1e262f'),
    Creator_ID: 'C105',
    Creator_Name: 'Ethan',
    Platform: 'YouTube',
    Category: 'Gaming',
    Country: 'Canada',
    Ads_Details: [
      {
        _id: ObjectId('698070dc38f8f1566a1e2634'),
        Ad_ID: 'A005',
        Creator_ID: 'C105',
        Page_ID: 'P005',
        Likes: 400,
        Shares: 200,
        Comments: 100,
        Page_Visits: 3000,
        Ad_Date: ISODate('2026-01-02T00:00:00.000Z'),
        Revenue: 7500.25
      },
      {
        _id: ObjectId('698070dc38f8f1566a1e2639'),
        Ad_ID: 'A010',
        Creator_ID: 'C105',
        Page_ID: 'P010',
        Likes: 500,
        Shares: 250,
        Comments: 150,
        Page_Visits: 3500,
        Ad_Date: ISODate('2026-01-03T00:00:00.000Z'),
        Revenue: 9000
      }
    ]
  }
]

Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> //Q1 Display complete details of a content creator with all associated ads

Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Creators.aggregate([
...  {
...    $lookup: {
...      from: "Ads",
...      localField: "Creator_ID",
...      foreignField: "Creator_ID",
...      as: "Ads_Details"
...    }
...  },
...  {
...    $project: {
...      _id: 0,
...      Creator_Name: 1,
...      Platform: 1,
...      Ads_Details: {
...        Ad_ID: 1,
...        Likes: 1,
...        Shares: 1,
...        Comments: 1,
...        Page_Visits: 1
...      }
...    }
...  }
... ])
...
[
  {
    Creator_Name: 'Alice',
    Platform: 'Instagram',
    Ads_Details: [
      {
        Ad_ID: 'A001',
        Likes: 150,
        Shares: 50,
        Comments: 30,
        Page_Visits: 1200
      },
      {
        Ad_ID: 'A006',
        Likes: 180,
        Shares: 70,
        Comments: 35,
        Page_Visits: 1500
      }
    ]
  },
  {
    Creator_Name: 'Bob',
    Platform: 'YouTube',
    Ads_Details: [
      {
        Ad_ID: 'A002',
        Likes: 200,
        Shares: 80,
        Comments: 45,
        Page_Visits: 1800
      },
      {
        Ad_ID: 'A007',
        Likes: 220,
        Shares: 90,
        Comments: 55,
        Page_Visits: 2000
      }
    ]
  },
  {
    Creator_Name: 'Charlie',
    Platform: 'Twitter',
    Ads_Details: [
      {
        Ad_ID: 'A003',
        Likes: 90,
        Shares: 20,
        Comments: 10,
        Page_Visits: 700
      },
      {
        Ad_ID: 'A008',
        Likes: 100,
        Shares: 25,
        Comments: 15,
        Page_Visits: 800
      }
    ]
  },
  {
    Creator_Name: 'Diana',
    Platform: 'Instagram',
    Ads_Details: [
      {
        Ad_ID: 'A004',
        Likes: 300,
        Shares: 120,
        Comments: 60,
        Page_Visits: 2500
      },
      {
        Ad_ID: 'A009',
        Likes: 350,
        Shares: 150,
        Comments: 75,
        Page_Visits: 2700
      }
    ]
  },
  {
    Creator_Name: 'Ethan',
    Platform: 'YouTube',
    Ads_Details: [
      {
        Ad_ID: 'A005',
        Likes: 400,
        Shares: 200,
        Comments: 100,
        Page_Visits: 3000
      },
      {
        Ad_ID: 'A010',
        Likes: 500,
        Shares: 250,
        Comments: 150,
        Page_Visits: 3500
      }
    ]
  }
]
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> //Q2: Total likes per creator
...

Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Ads.aggregate([
...  {
...    $lookup: {
...      from: "Creators",
...      localField: "Creator_ID",
...      foreignField: "Creator_ID",
...      as: "creator"
...    }
...  },
...  { $unwind: "$creator" },
...  {
...    $group: {
...      _id: "$creator.Creator_Name",
...      Total_Likes: { $sum: "$Likes" }
...    }
...  }
... ])
...
[
  { _id: 'Diana', Total_Likes: 650 },
  { _id: 'Ethan', Total_Likes: 900 },
  { _id: 'Charlie', Total_Likes: 190 },
  { _id: 'Alice', Total_Likes: 330 },
  { _id: 'Bob', Total_Likes: 420 }
]
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> //Q3 Highest revenue generating creator

Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Ads.aggregate([
...  {
...    $lookup: {
...      from: "Creators",
...      localField: "Creator_ID",
...      foreignField: "Creator_ID",
...      as: "creator"
...    }
...  },
...  { $unwind: "$creator" },
...  {
...    $group: {
...      _id: "$creator.Creator_Name",
...      Total_Revenue: { $sum: "$Revenue" }
...    }
...  },
...  { $sort: { Total_Revenue: -1 } }
... ])
...
[
  { _id: 'Ethan', Total_Revenue: 16500.25 },
  { _id: 'Diana', Total_Revenue: 11200 },
  { _id: 'Bob', Total_Revenue: 8500.5 },
  { _id: 'Alice', Total_Revenue: 5500.5 },
  { _id: 'Charlie', Total_Revenue: 2700.75 }
]
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> // Q4: Most popular platform (based on page visits)

Atlas atlas-ryqrm6-shard-0 [primary] socialmedia> db.Ads.aggregate([
...  {
...    $lookup: {
...      from: "Creators",
...      localField: "Creator_ID",
...      foreignField: "Creator_ID",
...      as: "creator"
...    }
...  },
...  { $unwind: "$creator" },
...  {
...    $group: {
...      _id: "$creator.Platform",
...      Total_Visits: { $sum: "$Page_Visits" }
...    }
...  },
...  { $sort: { Total_Visits: -1 } }
... ])
...
[
  { _id: 'YouTube', Total_Visits: 10300 },
  { _id: 'Instagram', Total_Visits: 7900 },
  { _id: 'Twitter', Total_Visits: 1500 }
]
Atlas atlas-ryqrm6-shard-0 [primary] socialmedia>Quey Completed
```
