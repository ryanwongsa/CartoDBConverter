# CartoDBConverter

Application to convert address to geolocation with additional fields for CartoDB.

## Usage

```bash
sh MainRun.sh <address_file> "<additional fields seperated by comma>" <num_of_additional_fields>
```

## Sample SQL to aquire address_file
```sql
SELECT PRIMARY_STREET1_DEL__C, PRIMARY_STREET2__C, PRIMARY_STREET3__C, PRIMARY_SUBURB__C, PRIMARY_CITY_DEL__C, PRIMARY_POSTAL_CODE_DEL__C, CURRENT_PROGRAMME__C, NAME FROM Contact
```
