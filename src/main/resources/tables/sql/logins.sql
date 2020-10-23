CREATE TABLE logins(
	l_id SERIAL PRIMARY KEY,
	application VARCHAR,
	app_account_name VARCHAR,
	is_active VARCHAR,
	job_title VARCHAR,
	department VARCHAR
)