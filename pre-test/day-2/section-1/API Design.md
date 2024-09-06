# API Design - Asset
### by: Kevin Ezra

### Asset Property:
```
{
  "id": {{ uniqueId }},
  "name": string,
  "description": string,
  "type": string,
  "is_available": boolean
}
```

## Create Asset
### POST /assets
##### Create new asset
#### Request Body:
```
{
  "name": string,
  "description": string,
  "type": string,
  "is_available": boolean
}
```

#### Response Body:
```
{
  "message": string,
  "id": {{ uniqueId }}
}
```

## Get Asset
### GET /assets
##### Get all assets
#### Response Body:
```
{
  "message": string,
  "data": [
    {
    "id": {{ uniqueId }}
    "name": string,
    "description": string,
    "type": string,
    "is_available": boolean
    },
    {
      "id": {{ uniqueId }}
    "name": string,
    "description": string,
    "type": string,
    "is_available": boolean
    },
    ...
  ]
}
```

### GET /asset/`id`
##### Get assets based on `id`
#### Response Body:
```
{
  "message": string,
  "data": {
    "id": {{ uniqueId }}
    "name": string,
    "description": string,
    "type": string,
    "is_available": boolean
  }
}
```

## Update Asset
### PUT /asset/`id`
##### Update existing asset based on `id`
#### Request Body:
```
{
  "name": string,
  "description": string,
  "type": string,
  "is_available": boolean
}
```

#### Response Body:
```
{
  "message": string,
  "data": {
    "id": {{ uniqueId }}
    "name": string,
    "description": string,
    "type": string,
    "is_available": boolean
  }
}
```

## Delete Asset
### DELETE /asset/`id`
##### Delete asset based on `id`
#### Response Body:
```
{
  "message": string,
  "id": {{ uniqueId }}
}
```